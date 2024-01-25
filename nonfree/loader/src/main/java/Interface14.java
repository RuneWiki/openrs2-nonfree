import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public interface Interface14 {

	@OriginalMember(owner = "loader!f", name = "loadClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0) throws ClassNotFoundException;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Class;I)V")
	void method6359(@OriginalArg(0) String arg0, @OriginalArg(1) Class arg1);

	@OriginalMember(owner = "loader!f", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException;
}
