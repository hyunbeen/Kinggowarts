(function ()
{
    'use strict';

    angular
        .module('app.map', ['ngMaterial'])
        .config(config);

    /** @ngInject */
    function config($stateProvider, $translatePartialLoaderProvider, msApiProvider, msNavigationServiceProvider)
    {
        // State
        $stateProvider
            .state('app.map', {
                url    : '/map',
                views  : {
                    'content@app': {
                        templateUrl: 'app/main/map/map.html',
                        controller : 'MapController as vm'
                    }
                },
                resolve: {
                    MarkerData: function (msApi)
                    {
                        return msApi.resolve('marker@get');
                    },
                    CategoryMarkerData: function(msApi)
                    {
                        return msApi.resolve('categoryMarker@get');
                    },
                    SubAreaData: function(msApi)
                    {
                        return msApi.resolve('subArea@get');
                    },
                    DrawingMenuData: function(msApi)
                    {
                        return msApi.resolve('drawingMenu@get');
                    },
                    CustomEventData: function(msApi)
                    {
                        return msApi.resolve('customEventData@get');
                    }
                }
            });

        // Api
        msApiProvider.register('marker', ['app/data/map/marker.json']);
        msApiProvider.register('categoryMarker', ['app/data/map/categoryMarker.json']);
        msApiProvider.register('subArea', ['app/data/map/subArea.json']);
        msApiProvider.register('drawingMenu', ['app/data/map/drawingMenu.json']);
        msApiProvider.register('customEventData', ['app/data/map/customEvent.json']);
    }
})();