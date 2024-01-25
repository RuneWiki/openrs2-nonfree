import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class254 {

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "[I")
	public int[] anIntArray710 = new int[20];

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray45;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "I")
	public final int anInt6497;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "I")
	public final int anInt6498;

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class254(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString68 = arg1;
		this.aStringArray45 = arg2;
		this.anInt6497 = arg3;
		this.anIntArray710 = arg5;
		this.anInt6498 = arg4;
		this.aString69 = arg0;
	}
}
