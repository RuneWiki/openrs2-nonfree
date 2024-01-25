import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class382 {

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "[I")
	public int[] anIntArray670 = new int[20];

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "I")
	public final int anInt10236;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray40;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString122;

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString121;

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "I")
	public final int anInt10235;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class382(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10236 = arg3;
		this.anIntArray670 = arg5;
		this.aStringArray40 = arg2;
		this.aString122 = arg1;
		this.aString121 = arg0;
		this.anInt10235 = arg4;
	}
}
