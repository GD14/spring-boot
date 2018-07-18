package cn.littleisle.singlelogin.business.Interceptor;

import cn.littleisle.singlelogin.orm.model.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.logging.Logger;

public class LoginInterceptor implements HandlerInterceptor {


    /**
     * 请求处理前执行
     * @param request
     * @param response
     * @param handler
     * @return
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
       HttpSession httpSession=request.getSession();
       User user=(User)httpSession.getAttribute("user");

       System.out.println("avc");
       //if(null==name)
        //   return false;
        return true;
    }

    /**
     * 请求处理后，视图渲染前执行
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {

    }

    /**
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {

    }
}
