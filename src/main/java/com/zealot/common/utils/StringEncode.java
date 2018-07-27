/*
 * COPYRIGHT. ShenZhen JiMi Technology Co., Ltd. 2018.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording, 
 * or otherwise, without the prior written permission of ShenZhen JiMi Network Technology Co., Ltd.
 *
 * Amendment History:
 * 
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2018年7月26日    Zhao Haiming         Create the class
 * http://www.jimilab.com/
*/

package com.zealot.common.utils;

import java.io.UnsupportedEncodingException;

/**
 * @FileName StringEncode.java
 * @Description: 
 *
 * @Date 2018年7月26日 下午6:29:25
 * @author Zhao Haiming
 * @version 1.0
 */
public class StringEncode {

    /**
     * 将ISO-8859-1编码字符串转换UTF-8编码
     * @param param
     * @return
     */
    public static String toUTF8(String param) throws UnsupportedEncodingException{
        if (param == null) {
            return null;
        } else {
            System.out.println(param);
            param = new String(param.getBytes("ISO-8859-1"), "UTF-8");
            System.out.println(param);
        }
        return param;
    }
    
    public static void main(String [] args)
    {
        try {
            String src = "\u6570\u636E\u5E93\u7D22\u5F15\uFF08\u9ED8\u8BA4\u4E3A0\uFF09";
            //String src = "\u8FDE\u63A5\u6C60\u6700\u5927\u963B\u585E\u7B49\u5F85\u65F6\u95F4\uFF08\u4F7F\u7528\u8D1F\u503C\u8868\u793A\u6CA1\u6709\u9650\u5236\uFF09";
            String s = toUTF8(src);
            System.out.println(s);
        } catch (UnsupportedEncodingException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
