import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!g")
public final class Class369 {

	@OriginalMember(owner = "loader!g", name = "b", descriptor = "[I")
	public int[] anIntArray558 = new int[20];

	@OriginalMember(owner = "loader!g", name = "a", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray74;

	@OriginalMember(owner = "loader!g", name = "e", descriptor = "I")
	public final int anInt10303;

	@OriginalMember(owner = "loader!g", name = "d", descriptor = "Ljava/lang/String;")
	public final String aString121;

	@OriginalMember(owner = "loader!g", name = "f", descriptor = "I")
	public final int anInt10304;

	@OriginalMember(owner = "loader!g", name = "c", descriptor = "Ljava/lang/String;")
	public final String aString120;

	@OriginalMember(owner = "loader!g", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class369(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.aStringArray74 = arg2;
		this.anInt10303 = arg4;
		this.aString121 = arg0;
		this.anInt10304 = arg3;
		this.aString120 = arg1;
		this.anIntArray558 = arg5;
	}
}
