import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class367 {

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "[I")
	public int[] anIntArray703 = new int[20];

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray191;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "I")
	public final int anInt9656;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "I")
	public final int anInt9655;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class367(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray703 = arg5;
		this.aString103 = arg0;
		this.aStringArray191 = arg2;
		this.aString102 = arg1;
		this.anInt9656 = arg3;
		this.anInt9655 = arg4;
	}
}
