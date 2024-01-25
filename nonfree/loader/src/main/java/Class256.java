import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class256 {

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[I")
	public int[] anIntArray754 = new int[20];

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public final int anInt6432;

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public final int anInt6431;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray91;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class256(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString72 = arg1;
		this.anInt6432 = arg3;
		this.anIntArray754 = arg5;
		this.anInt6431 = arg4;
		this.aString71 = arg0;
		this.aStringArray91 = arg2;
	}
}
