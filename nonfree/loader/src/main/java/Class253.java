import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!d")
public final class Class253 {

	@OriginalMember(owner = "loader!d", name = "c", descriptor = "[I")
	public int[] anIntArray591 = new int[20];

	@OriginalMember(owner = "loader!d", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString66;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray47;

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "I")
	public final int anInt7147;

	@OriginalMember(owner = "loader!d", name = "f", descriptor = "I")
	public final int anInt7148;

	@OriginalMember(owner = "loader!d", name = "e", descriptor = "Ljava/lang/String;")
	public final String aString67;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class253(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString66 = arg1;
		this.aStringArray47 = arg2;
		this.anInt7147 = arg3;
		this.anInt7148 = arg4;
		this.anIntArray591 = arg5;
		this.aString67 = arg0;
	}
}
