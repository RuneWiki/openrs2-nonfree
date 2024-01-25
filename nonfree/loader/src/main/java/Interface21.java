import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public interface Interface21 {

	@OriginalMember(owner = "loader!a", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Class;)V")
	void method7498(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1);

	@OriginalMember(owner = "loader!a", name = "loadClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0) throws ClassNotFoundException;
}
