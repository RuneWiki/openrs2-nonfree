import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class256 {

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "[I")
	public int[] anIntArray1360 = new int[20];

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "I")
	public final int anInt6630;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray164;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "I")
	public final int anInt6629;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class256(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6630 = arg4;
		this.aString69 = arg1;
		this.aStringArray164 = arg2;
		this.anInt6629 = arg3;
		this.anIntArray1360 = arg5;
		this.aString70 = arg0;
	}
}
