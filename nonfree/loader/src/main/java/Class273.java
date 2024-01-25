import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class273 {

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "[I")
	public int[] anIntArray524 = new int[20];

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	public final int anInt7857;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString72;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	public final int anInt7856;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray45;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class273(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString73 = arg1;
		this.anInt7857 = arg4;
		this.anIntArray524 = arg5;
		this.aString72 = arg0;
		this.anInt7856 = arg3;
		this.aStringArray45 = arg2;
	}
}
