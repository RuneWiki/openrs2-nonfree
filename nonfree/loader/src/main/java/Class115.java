import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!a")
public final class Class115 {

	@OriginalMember(owner = "loader!a", name = "d", descriptor = "[I")
	public int[] anIntArray798 = new int[20];

	@OriginalMember(owner = "loader!a", name = "g", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "loader!a", name = "c", descriptor = "I")
	public int anInt4923;

	@OriginalMember(owner = "loader!a", name = "a", descriptor = "I")
	public int anInt4922;

	@OriginalMember(owner = "loader!a", name = "e", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "loader!a", name = "b", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "loader!a", name = "f", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "loader!a", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[I)V")
	public Class115(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.aString11 = arg0;
		this.anInt4923 = arg5;
		this.anInt4922 = arg4;
		this.aString9 = arg1;
		this.anIntArray798 = arg6;
		this.aString8 = arg3;
		this.aString10 = arg2;
	}
}
