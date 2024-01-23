import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!c")
public final class Class128 {

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "[I")
	public int[] anIntArray381 = new int[20];

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "Ljava/lang/String;")
	public String aString11;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/String;")
	public String aString10;

	@OriginalMember(owner = "loader!c", name = "g", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "I")
	public int anInt4891;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "I")
	public int anInt4890;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/lang/String;")
	public String aString9;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[I)V")
	public Class128(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.aString11 = arg0;
		this.aString10 = arg2;
		this.aString12 = arg3;
		this.anInt4891 = arg5;
		this.anInt4890 = arg4;
		this.aString9 = arg1;
		this.anIntArray381 = arg6;
	}
}
