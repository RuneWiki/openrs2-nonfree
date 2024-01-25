import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class275 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "[I")
	public int[] anIntArray538 = new int[20];

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray53;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString71;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt7686;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "I")
	public final int anInt7685;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class275(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray53 = arg2;
		this.aString70 = arg1;
		this.anIntArray538 = arg5;
		this.aString71 = arg0;
		this.anInt7686 = arg3;
		this.anInt7685 = arg4;
	}
}
