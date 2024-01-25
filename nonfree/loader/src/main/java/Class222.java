import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class222 {

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "[I")
	public int[] anIntArray681 = new int[20];

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "I")
	public final int anInt6803;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString279;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString278;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray44;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "I")
	public final int anInt6804;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class222(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt6803 = arg4;
		this.aString279 = arg0;
		this.aString278 = arg1;
		this.aStringArray44 = arg2;
		this.anInt6804 = arg3;
		this.anIntArray681 = arg5;
	}
}
