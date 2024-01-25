import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class370 {

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "[I")
	public int[] anIntArray707 = new int[20];

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray51;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString141;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt9443;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString142;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public final int anInt9442;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class370(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray51 = arg2;
		this.aString141 = arg0;
		this.anInt9443 = arg4;
		this.anIntArray707 = arg5;
		this.aString142 = arg1;
		this.anInt9442 = arg3;
	}
}
