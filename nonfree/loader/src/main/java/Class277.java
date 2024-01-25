import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class277 {

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "[I")
	public int[] anIntArray641 = new int[20];

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString78;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray72;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString77;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "I")
	public final int anInt7788;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt7789;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class277(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString78 = arg1;
		this.aStringArray72 = arg2;
		this.aString77 = arg0;
		this.anInt7788 = arg4;
		this.anIntArray641 = arg5;
		this.anInt7789 = arg3;
	}
}
