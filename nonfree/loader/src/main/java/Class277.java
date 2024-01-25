import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!f")
public final class Class277 {

	@OriginalMember(owner = "loader!f", name = "c", descriptor = "[I")
	public int[] anIntArray578 = new int[20];

	@OriginalMember(owner = "loader!f", name = "e", descriptor = "I")
	public final int anInt7677;

	@OriginalMember(owner = "loader!f", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString76;

	@OriginalMember(owner = "loader!f", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray48;

	@OriginalMember(owner = "loader!f", name = "b", descriptor = "I")
	public final int anInt7676;

	@OriginalMember(owner = "loader!f", name = "f", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "loader!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class277(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anIntArray578 = arg5;
		this.anInt7677 = arg4;
		this.aString76 = arg0;
		this.aStringArray48 = arg2;
		this.anInt7676 = arg3;
		this.aString77 = arg1;
	}
}
