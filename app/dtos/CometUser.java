package dtos; /**
 * @author Ivica
 */

import play.libs.Comet;

/**
 * 
 */
public class CometUser {
    public Comet comet;
    public User user;

    public CometUser(Comet comet, User user) {
        this.comet = comet;
        this.user = user;
    }
}
