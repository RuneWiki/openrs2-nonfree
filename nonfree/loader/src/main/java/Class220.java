import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class220 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "[I")
	public int[] anIntArray534 = new int[20];

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "I")
	public final int anInt6814;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray65;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "I")
	public final int anInt6813;

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString70;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class220(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray534 = arg5;
		this.anInt6814 = arg4;
		this.aString69 = arg0;
		this.aStringArray65 = arg2;
		this.anInt6813 = arg3;
		this.aString70 = arg1;
	}
}
