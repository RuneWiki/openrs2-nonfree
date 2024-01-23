import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("loader!b")
public final class Class129 {

	@OriginalMember(owner = "loader!b", name = "g", descriptor = "[I")
	public int[] anIntArray385 = new int[20];

	@OriginalMember(owner = "loader!b", name = "c", descriptor = "I")
	public int anInt5007;

	@OriginalMember(owner = "loader!b", name = "e", descriptor = "Ljava/lang/String;")
	public String aString14;

	@OriginalMember(owner = "loader!b", name = "d", descriptor = "I")
	public int anInt5008;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/lang/String;")
	public String aString13;

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/lang/String;")
	public String aString12;

	@OriginalMember(owner = "loader!b", name = "f", descriptor = "Ljava/lang/String;")
	public String aString15;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[I)V")
	public Class129(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6) {
		this.anInt5007 = arg5;
		this.aString14 = arg3;
		this.anIntArray385 = arg6;
		this.anInt5008 = arg4;
		this.aString13 = arg2;
		this.aString12 = arg0;
		this.aString15 = arg1;
	}
}
