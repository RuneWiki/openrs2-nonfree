import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public interface Interface28 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "(BLjava/lang/Class;Ljava/lang/String;)V")
	void method9385(@OriginalArg(1) Class arg0, @OriginalArg(2) String arg1);

	@OriginalMember(owner = "loader!g", name = "loadClass", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1) throws ClassNotFoundException;

	@OriginalMember(owner = "loader!g", name = "loadClass", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
	Class loadClass(@OriginalArg(0) String arg0) throws ClassNotFoundException;
}
