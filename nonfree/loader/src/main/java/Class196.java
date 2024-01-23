import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class196 {

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "[I")
	public int[] anIntArray635 = new int[20];

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	public String aString235;

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray44;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "I")
	public int anInt6158;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "I")
	public int anInt6157;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "Ljava/lang/String;")
	public String aString234;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class196(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString235 = arg1;
		this.aStringArray44 = arg2;
		this.anIntArray635 = arg5;
		this.anInt6158 = arg4;
		this.anInt6157 = arg3;
		this.aString234 = arg0;
	}
}
