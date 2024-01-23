import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class198 {

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "[I")
	public int[] anIntArray614 = new int[20];

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "Ljava/lang/String;")
	public String aString222;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public String aString223;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public int anInt5640;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[Ljava/lang/String;")
	public String[] aStringArray39;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "I")
	public int anInt5639;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class198(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aString222 = arg1;
		this.aString223 = arg0;
		this.anIntArray614 = arg5;
		this.anInt5640 = arg4;
		this.aStringArray39 = arg2;
		this.anInt5639 = arg3;
	}
}
