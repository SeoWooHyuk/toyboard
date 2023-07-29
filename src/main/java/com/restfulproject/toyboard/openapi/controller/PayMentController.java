// package com.restfulproject.toyboard.openapi.controller;

// import java.io.IOException;
// import java.util.HashMap;
// import java.util.Locale;
// import java.util.Map;

// import javax.servlet.http.HttpSession;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.ResponseBody;

// @Controller
// public class PayMentController {

//     @Autowired
//    UserService userService;

//    private IamportClient api;
   
//    public PayMentController(){
//       //토큰 발급
//       this.api = new IamportClient("6510774276607636","hzGO6aM6m3xfCHWeXIUmOHf0gPbIjUtLF1lU9Otr48iYpF9DeZWSyLXiqZYYxb5ZpsTtQa1RWMLGgOnn");
//       System.out.println("fffffffffff"+api);
//    }

   
      
//    @ResponseBody
//    @RequestMapping(value="/verifyiamport/{imp_uid}", method=RequestMethod.POST)
//    public IamportResponse<Payment> paymentByImpUid(Model model, Locale locale, HttpSession session
//          , @PathVariable(value= "imp_uid") String imp_uid, @RequestParam("amount") String paid_amount) throws IamportResponseException, IOException{   
      
//             System.out.println("verifyController");
//          return api.paymentByImpUid(imp_uid);
//    }
   
//    //결제 완료 시 DB에 결제 완료 처리 - 02.15
//    //관리자 페이지 코드 추가 - 02.19

//    @ResponseBody
//    @RequestMapping(value="/paySuccess", method=RequestMethod.POST)
//    public void paySuccess(@RequestParam("paid_amount")String amount,@RequestParam("imp_uid")String ID) {

//       System.out.println("controller/"+amount+"/"+ID);

//       int tmp = Integer.parseInt(amount);
//       int months = tmp/15000; //개월 수로 치환 -> 기간 갱신을 위함
//       Map<String, Object> map = new HashMap<>();

//       map.put("ID", ID);
//       map.put("months", months);

//       if(userService.paidCheck(ID) == "Y") {
//          userService.rePaid(map);
//       }
//       else {
//          userService.paid(map); //첫 결제시 : map에 ID, 개월 수 넣고 DB갱신
//       }
         
//    }   
// }