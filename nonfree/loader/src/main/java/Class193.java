import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class193 {

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[I")
	public int[] anIntArray489 = new int[20];

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray38;

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public int anInt5875;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "Ljava/lang/String;")
	public String aString203;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "I")
	public int anInt5876;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public String aString202;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class193(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray38 = arg2;
		this.anIntArray489 = arg5;
		this.anInt5875 = arg4;
		this.aString203 = arg0;
		this.anInt5876 = arg3;
		this.aString202 = arg1;
	}
}
