import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public interface Interface13 {

	@OriginalMember(owner = "loader!e", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException;

	@OriginalMember(owner = "loader!e", name = "loadClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0) throws ClassNotFoundException;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/Class;)V")
	void method6092(@OriginalArg(1) String arg0, @OriginalArg(2) Class arg1);
}
