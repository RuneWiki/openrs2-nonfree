import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!h")
public final class Class327 {

	@OriginalMember(owner = "loader!h", name = "f", descriptor = "[I")
	public int[] anIntArray710 = new int[20];

	@OriginalMember(owner = "loader!h", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString118;

	@OriginalMember(owner = "loader!h", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray63;

	@OriginalMember(owner = "loader!h", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString117;

	@OriginalMember(owner = "loader!h", name = "d", descriptor = "I")
	public final int anInt9733;

	@OriginalMember(owner = "loader!h", name = "c", descriptor = "I")
	public final int anInt9732;

	@OriginalMember(owner = "loader!h", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class327(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString118 = arg0;
		this.anIntArray710 = arg5;
		this.aStringArray63 = arg2;
		this.aString117 = arg1;
		this.anInt9733 = arg4;
		this.anInt9732 = arg3;
	}
}
