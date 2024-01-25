import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class410 {

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "[I")
	public int[] anIntArray642 = new int[20];

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString135;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray43;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "I")
	public final int anInt11314;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString136;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "I")
	public final int anInt11313;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class410(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray642 = arg5;
		this.aString135 = arg1;
		this.aStringArray43 = arg2;
		this.anInt11314 = arg3;
		this.aString136 = arg0;
		this.anInt11313 = arg4;
	}
}
