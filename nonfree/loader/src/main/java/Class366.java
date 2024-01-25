import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class366 {

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[I")
	public int[] anIntArray643 = new int[20];

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "I")
	public final int anInt9691;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public final int anInt9690;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString101;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString100;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray43;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class366(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray643 = arg5;
		this.anInt9691 = arg4;
		this.anInt9690 = arg3;
		this.aString101 = arg0;
		this.aString100 = arg1;
		this.aStringArray43 = arg2;
	}
}
