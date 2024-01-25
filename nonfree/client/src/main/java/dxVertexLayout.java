import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class265 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "g", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!wda;[Lclient!wj;)V")
	public dxVertexLayout(@OriginalArg(0) Class9_Sub1_Sub2 arg0, @OriginalArg(1) Class317[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.anOf1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class317 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method7853(); local27++) {
				@Pc(41) Class245 local41 = local25.method7858(local27);
				@Pc(48) byte local48;
				@Pc(46) byte local46;
				@Pc(50) int local50;
				if (local41 == Static397.aClass245_1) {
					local46 = 0;
					local48 = 2;
					local50 = 0;
				} else if (local41 == Static397.aClass245_2) {
					local48 = 2;
					local46 = 3;
					local50 = 0;
				} else if (Static397.aClass245_3 == local41) {
					local48 = 4;
					local50 = 0;
					local46 = 10;
				} else if (local41 == Static397.aClass245_4) {
					local48 = 0;
					local46 = 5;
					local50 = local9++;
				} else if (Static397.aClass245_5 == local41) {
					local48 = 1;
					local50 = local9++;
					local46 = 5;
				} else if (Static397.aClass245_6 == local41) {
					local50 = local9++;
					local46 = 5;
					local48 = 2;
				} else {
					local46 = 5;
					local48 = 3;
					local50 = local9++;
				}
				local7.addElement(local11, local48, 0, local46, local50, local21);
				local21 += local41.anInt6948;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
