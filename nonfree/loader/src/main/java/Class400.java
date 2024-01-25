import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class400 {

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "[I")
	public int[] anIntArray700 = new int[20];

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public final int anInt10545;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public final String aString130;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	public final String aString131;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "I")
	public final int anInt10546;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray49;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;II[I)V")
	public Class400(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		this.anInt10545 = arg4;
		this.aString130 = arg1;
		this.aString131 = arg0;
		this.anInt10546 = arg3;
		this.anIntArray700 = arg5;
		this.aStringArray49 = arg2;
	}
}
