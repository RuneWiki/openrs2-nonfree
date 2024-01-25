import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class370 {

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "[I")
	public int[] anIntArray623 = new int[20];

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public final int anInt9656;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString158;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString157;

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "I")
	public final int anInt9657;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class370(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt9656 = arg4;
		this.anIntArray623 = arg5;
		this.aStringArray47 = arg2;
		this.aString158 = arg0;
		this.aString157 = arg1;
		this.anInt9657 = arg3;
	}
}
