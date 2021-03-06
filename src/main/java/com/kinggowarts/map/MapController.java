package com.kinggowarts.map;

import com.kinggowarts.map.models.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController @RequestMapping(value="/api/map")
public class MapController {

    @Autowired
    private MapService mapService;

    @RequestMapping(value="", method=RequestMethod.GET)
    public List<HashMap<String, Object>> findAllCoordinate(@RequestParam("type") String type){
        return mapService.findAllCoordinate(type);
    }

    @RequestMapping(value="", method=RequestMethod.POST)
    public String saveLocation(@RequestParam("name") String name,
                             @RequestParam("center") HashMap<String, Double> center,
                             @RequestParam("shape") String shape,
                             @RequestParam("path") List<HashMap<String, Double>> path,
                             @RequestParam("detail") String detail) {
        return mapService.saveLocation(name, center, shape, path, detail);
    }

    @RequestMapping(value="/search", method=RequestMethod.GET)
    public List<Location> searchLocation(@RequestParam("q") String q){
        return mapService.searchLocation(q);
    }
}