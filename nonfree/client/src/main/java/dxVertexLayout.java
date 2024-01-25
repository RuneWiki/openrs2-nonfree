import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class82 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "h", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!oe;[Lclient!ls;)V")
	public dxVertexLayout(@OriginalArg(0) Class7_Sub1_Sub2 arg0, @OriginalArg(1) Class204[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aJd1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class204 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method4831() > local27; local27++) {
				@Pc(37) Class91 local37 = local25.method4828(local27);
				@Pc(42) byte local42;
				@Pc(46) byte local46;
				@Pc(44) int local44;
				if (Static117.aClass91_1 == local37) {
					local42 = 2;
					local44 = 0;
					local46 = 0;
				} else if (local37 == Static117.aClass91_2) {
					local46 = 3;
					local44 = 0;
					local42 = 2;
				} else if (Static117.aClass91_3 == local37) {
					local44 = 0;
					local42 = 4;
					local46 = 10;
				} else if (local37 == Static117.aClass91_4) {
					local44 = local9++;
					local46 = 5;
					local42 = 0;
				} else if (Static117.aClass91_5 == local37) {
					local44 = local9++;
					local42 = 1;
					local46 = 5;
				} else if (Static117.aClass91_6 == local37) {
					local46 = 5;
					local42 = 2;
					local44 = local9++;
				} else {
					local44 = local9++;
					local42 = 3;
					local46 = 5;
				}
				local7.addElement(local11, local42, 0, local46, local44, local21);
				local21 += local37.anInt2697;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
