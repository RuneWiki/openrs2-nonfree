import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class383 {

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "[I")
	public int[] anIntArray635 = new int[20];

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public final int anInt10563;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString116;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "I")
	public final int anInt10562;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString115;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray43;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class383(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10563 = arg4;
		this.aString116 = arg0;
		this.anIntArray635 = arg5;
		this.anInt10562 = arg3;
		this.aString115 = arg1;
		this.aStringArray43 = arg2;
	}
}
