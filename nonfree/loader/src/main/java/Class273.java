import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class273 {

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "[I")
	public int[] anIntArray639 = new int[20];

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "I")
	public final int anInt7459;

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "I")
	public final int anInt7458;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray50;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class273(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt7459 = arg3;
		this.aString77 = arg0;
		this.anInt7458 = arg4;
		this.aStringArray50 = arg2;
		this.aString76 = arg1;
		this.anIntArray639 = arg5;
	}
}
