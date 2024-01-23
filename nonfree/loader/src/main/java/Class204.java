import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class204 {

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "[I")
	public int[] anIntArray557 = new int[20];

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Ljava/lang/String;")
	public String aString338;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public int anInt5651;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	public String aString337;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "I")
	public int anInt5652;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray62;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class204(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString338 = arg1;
		this.anInt5651 = arg3;
		this.aString337 = arg0;
		this.anInt5652 = arg4;
		this.anIntArray557 = arg5;
		this.aStringArray62 = arg2;
	}
}
