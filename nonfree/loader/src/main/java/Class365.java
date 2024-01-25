import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class365 {

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "[I")
	public int[] anIntArray727 = new int[20];

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "I")
	public final int anInt9847;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "I")
	public final int anInt9846;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString104;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class365(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString103 = arg1;
		this.anInt9847 = arg4;
		this.anInt9846 = arg3;
		this.aString104 = arg0;
		this.anIntArray727 = arg5;
		this.aStringArray40 = arg2;
	}
}
