package entity;

import lombok.Data;

import java.util.Date;

/**
 * @author YanHao [yanhao@tiemavi.com]
 */
@Data
public class UacUser {

    private Long id;

    private String userName;

    private String nickName;

    private String password;

    private String mobileNo;

    private String email;

    private Integer state;

    private Date createdTime;

    private Date updatedTime;

}
