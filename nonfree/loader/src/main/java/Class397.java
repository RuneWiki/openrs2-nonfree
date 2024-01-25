import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class397 {

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "[I")
	public int[] anIntArray718 = new int[20];

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "I")
	public final int anInt10837;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "I")
	public final int anInt10836;

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray66;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString168;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString169;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class397(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray718 = arg5;
		this.anInt10837 = arg4;
		this.anInt10836 = arg3;
		this.aStringArray66 = arg2;
		this.aString168 = arg1;
		this.aString169 = arg0;
	}
}
