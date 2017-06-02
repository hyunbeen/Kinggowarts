(function ()
{
    'use strict';

    angular
        .module('app.register-v2',
                 ['flow'])
        .config(config);

    /** @ngInject */
    function config($stateProvider, $translatePartialLoaderProvider, msApiProvider,msNavigationServiceProvider)
    {
        // State
        
        $stateProvider
            .state('register-v2', {
                url: '/register-v2',
                views: {
                    
                    'main@' : {
                        templateUrl: 'app/main/register-v2/register-v2.html',
                        controller: 'RegisterV2Controller as vm'
                    }
                    
                }
            });

       
    }

})();
