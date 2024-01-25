import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class322 {

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "[I")
	public int[] anIntArray840 = new int[20];

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString220;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString219;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "I")
	public final int anInt9610;

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "I")
	public final int anInt9611;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray45;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class322(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray840 = arg5;
		this.aString220 = arg1;
		this.aString219 = arg0;
		this.anInt9610 = arg3;
		this.anInt9611 = arg4;
		this.aStringArray45 = arg2;
	}
}
