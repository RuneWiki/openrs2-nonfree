import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class383 {

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "[I")
	public int[] anIntArray721 = new int[20];

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public final int anInt11099;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString131;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString132;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public final int anInt11100;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class383(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray47 = arg2;
		this.anInt11099 = arg3;
		this.aString131 = arg0;
		this.aString132 = arg1;
		this.anIntArray721 = arg5;
		this.anInt11100 = arg4;
	}
}
