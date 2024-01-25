import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class368 {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "[I")
	public int[] anIntArray645 = new int[20];

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray41;

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public final int anInt9777;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString102;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString103;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "I")
	public final int anInt9778;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class368(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray41 = arg2;
		this.anInt9777 = arg4;
		this.aString102 = arg0;
		this.aString103 = arg1;
		this.anIntArray645 = arg5;
		this.anInt9778 = arg3;
	}
}
