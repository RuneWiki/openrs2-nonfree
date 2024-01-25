import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class271 {

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "[I")
	public int[] anIntArray647 = new int[20];

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString73;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt7279;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "I")
	public final int anInt7278;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class271(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString73 = arg0;
		this.anInt7279 = arg4;
		this.aStringArray49 = arg2;
		this.anIntArray647 = arg5;
		this.anInt7278 = arg3;
		this.aString74 = arg1;
	}
}
