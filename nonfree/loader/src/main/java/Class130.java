import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!e")
public final class Class130 {

	@OriginalMember(owner = "loader!e", name = "c", descriptor = "[I")
	public int[] anIntArray522 = new int[20];

	@OriginalMember(owner = "loader!e", name = "f", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "loader!e", name = "g", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "loader!e", name = "d", descriptor = "I")
	public int anInt4500;

	@OriginalMember(owner = "loader!e", name = "b", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "loader!e", name = "e", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "loader!e", name = "a", descriptor = "I")
	public int anInt4499;

	@OriginalMember(owner = "loader!e", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[I)V")
	public Class130(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.aString14 = arg3;
		this.aString15 = arg2;
		this.anInt4500 = arg5;
		this.aString12 = arg0;
		this.anIntArray522 = arg6;
		this.aString13 = arg1;
		this.anInt4499 = arg4;
	}
}
