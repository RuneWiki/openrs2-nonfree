import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public interface Interface24 {

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(Ljava/lang/Class;ILjava/lang/String;)V")
	void method7909(@OriginalArg(0) Class arg0, @OriginalArg(2) String arg1);

	@OriginalMember(owner = "loader!d", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException;

	@OriginalMember(owner = "loader!d", name = "loadClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0) throws ClassNotFoundException;
}
