import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class352 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "[I")
	public int[] anIntArray739 = new int[20];

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "I")
	public final int anInt9660;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString126;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt9661;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString127;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class352(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt9660 = arg4;
		this.anIntArray739 = arg5;
		this.aStringArray40 = arg2;
		this.aString126 = arg1;
		this.anInt9661 = arg3;
		this.aString127 = arg0;
	}
}
