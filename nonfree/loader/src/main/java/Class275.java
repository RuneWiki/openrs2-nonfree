import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class275 {

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "[I")
	public int[] anIntArray630 = new int[20];

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray55;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString75;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	public final int anInt7545;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString74;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "I")
	public final int anInt7546;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class275(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray55 = arg2;
		this.aString75 = arg1;
		this.anInt7545 = arg3;
		this.anIntArray630 = arg5;
		this.aString74 = arg0;
		this.anInt7546 = arg4;
	}
}
