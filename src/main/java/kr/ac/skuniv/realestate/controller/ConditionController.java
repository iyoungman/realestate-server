package kr.ac.skuniv.realestate.controller;

import kr.ac.skuniv.realestate.domain.dto.ConditionDto;
import kr.ac.skuniv.realestate.repository.ForsaleRepository;
import kr.ac.skuniv.realestate.service.ConditionService;
import kr.ac.skuniv.realestate.utill.ExcelConverterUtill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "realestate/condition/*")
public class ConditionController {
    private Logger logger = LoggerFactory.getLogger(ConditionController.class);
    private ForsaleRepository forsaleRepository;
    private ConditionService conditionService;
    ConditionDto conditionDto;

    public ConditionController(ForsaleRepository forsaleRepository, ConditionService conditionService) {
        this.forsaleRepository = forsaleRepository;
        this.conditionService = conditionService;
    }

    @GetMapping("test/{city}")
    public int test(@PathVariable String city){
        logger.info("/realestate/condition/test/{city}");
        return conditionService.translateCode(city);
    }

    @GetMapping("/city/{city}/date/{date}")
    public ConditionDto cityAndDate(@PathVariable String city, @PathVariable int date){


        return conditionDto;
    }

    @GetMapping("/city/{city}/date")
    public ConditionDto onlyCity(@PathVariable String city, @PathVariable int date){

        return conditionDto;
    }

    @GetMapping("/city/{city}/district/{district}/date")
    public ConditionDto cityAndDistrict(@PathVariable String city, @PathVariable String district){


        return conditionDto;
    }

    @GetMapping("/city/{city}/district/{district}/date/{date}")
    public ConditionDto cityAndDistrictAndDate(@PathVariable String city, @PathVariable String district, @PathVariable int date){


        return conditionDto;
    }

    @GetMapping("/city/{city}/district/{district}/neighborhood/{neighborhood}/date")
    public ConditionDto cityAndDistrictAndNeighborhood(@PathVariable String city, @PathVariable String district,@PathVariable String neighborhood){


        return conditionDto;
    }


    @GetMapping("/city/{city}/district/{district}/neighborhood/{neighborhood}/date/{date}")
    public ConditionDto cityAndDistrictAndNeighborhoodAndDate(@PathVariable String city, @PathVariable String district,@PathVariable String neighborhood, @PathVariable int date){


        return conditionDto;
    }
//
//    @GetMapping("/start")
//    public String testExcel(){
//        HashMap<String, Integer> test = new HashMap<>();
//        try {
//            test = excelConverterUtill.ReadRegionCode();
//        }catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }catch (IOException e1){
//            System.out.println(e1.getMessage());
//        }
//        System.out.println(test.get("서울특별시 중구 회현동").toString());
//        return "test1";
//    }
}