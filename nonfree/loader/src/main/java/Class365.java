import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class365 {

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "[I")
	public int[] anIntArray687 = new int[20];

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray39;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "I")
	public final int anInt10467;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString146;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString147;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt10468;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class365(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray39 = arg2;
		this.anInt10467 = arg4;
		this.aString146 = arg0;
		this.aString147 = arg1;
		this.anInt10468 = arg3;
		this.anIntArray687 = arg5;
	}
}
