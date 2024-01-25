import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class273 {

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[I")
	public int[] anIntArray693 = new int[20];

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public final int anInt7855;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString68;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray58;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "I")
	public final int anInt7856;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString69;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class273(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt7855 = arg3;
		this.aString68 = arg1;
		this.aStringArray58 = arg2;
		this.anIntArray693 = arg5;
		this.anInt7856 = arg4;
		this.aString69 = arg0;
	}
}
