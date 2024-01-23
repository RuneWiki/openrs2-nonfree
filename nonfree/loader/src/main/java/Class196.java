import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class196 {

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "[I")
	public int[] anIntArray509 = new int[20];

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "I")
	public int anInt5747;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "Ljava/lang/String;")
	public String aString344;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray41;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public int anInt5746;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "Ljava/lang/String;")
	public String aString343;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class196(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray509 = arg5;
		this.anInt5747 = arg4;
		this.aString344 = arg1;
		this.aStringArray41 = arg2;
		this.anInt5746 = arg3;
		this.aString343 = arg0;
	}
}
